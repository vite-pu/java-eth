package xyz.asurily.service;

import java.math.BigInteger;

public interface IEthService {

    BigInteger getCurrentBlockNumber();

    BigInteger getEthBalance(String address);

    String transfer(String contractAddress, String toAddress, String amount);
}
