package xyz.asurily.service;

import org.springframework.stereotype.Service;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.admin.Admin;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.EthBlockNumber;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.protocol.geth.Geth;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.parity.Parity;
import org.web3j.tx.Contract;
import org.web3j.tx.ManagedTransaction;
import org.web3j.tx.RawTransactionManager;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

@Service
public class EthServiceImpl implements IEthService {

    private final String gethClientUrl = "http://127.0.0.1:9999";

    private final String privKey = "0x3d94860faa332b3c30e6452da076e02e7dab6f66e8124b226b30689d77dd1b10";

    @Override
    public BigInteger getCurrentBlockNumber() {
        Web3j web3j = initWeb3j();
        Request<?, EthBlockNumber> request = web3j.ethBlockNumber();
        try {

            return request.send().getBlockNumber();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return BigInteger.valueOf(0L);
    }

    @Override
    public BigInteger getEthBalance(String address) {
        Web3j web3j = initWeb3j();
        Request<?, EthGetBalance> request = web3j.ethGetBalance(address, DefaultBlockParameterName.LATEST);
        try {
            return request.send().getBalance();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String transfer(String contractAddress, String toAddress, String amount) {

        Function function = new Function(
                "transfer",
                Arrays.<Type>asList(new Address(toAddress),
                        new Uint256(new BigInteger(amount))),
                Collections.<TypeReference<?>>emptyList());
        String encodedFunction = FunctionEncoder.encode(function);
        // 创建 tx 管理器，并通过 txManager 来发起合约转账
        Web3j web3j = initWeb3j();
        RawTransactionManager txManager = null;
        try {
            txManager = new RawTransactionManager(web3j, loadCredentials(privKey));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CipherException e) {
            e.printStackTrace();
        }
        EthSendTransaction transactionResponse = null;
        try {
            transactionResponse = txManager.sendTransaction(
                    ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT,
                    contractAddress, encodedFunction, BigInteger.ZERO);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 获取 TxHash
        String transactionHash = transactionResponse.getTransactionHash();
        return transactionHash;
    }

    public static Credentials loadCredentials(String privKey)
            throws IOException, CipherException {
        return Credentials.create(privKey);
    }

    /**
     * 初始化web3j普通api调⽤用
     *
     * @return web3j
     */
    private Parity initParity() {
        return Parity.build(getService());
    }

    private Web3j initWeb3j() {
        return Web3j.build(getService());
    }

    /**
     * 初始化personal级别的操作对象
     *
     * @return Geth
     */
    private Geth initGeth() {
        return Geth.build(getService());
    }

    /**
     * 初始化admin级别操作的对象
     *
     * @return Admin
     */
    private Admin initAdmin() {
        return Admin.build(getService());
    }

    /**
     * 通过http连接到geth节点
     *
     * @return
     */
    private HttpService getService() {
        return new HttpService(gethClientUrl);
    }
}
