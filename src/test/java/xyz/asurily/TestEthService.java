package xyz.asurily;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.asurily.service.IEthService;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.BigInteger;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestEthService {

    @Resource
    private IEthService iEthService;

    @Test
    public void TestGetCurrentHeight() {
        BigInteger height = iEthService.getCurrentBlockNumber();

        System.out.println(height);
    }

    @Test
    public void TestGetEthBalance() {
        BigInteger balance = iEthService.getEthBalance("0x50cae2793720d037275acbd1fd65bc34a56776fb");

        System.out.println(balance);

        BigDecimal bigDecimal = new BigDecimal(balance);
        String bal = bigDecimal.divide(new BigDecimal(Math.pow(10, 18))).toString();
        System.out.println(bal);
    }

    @Test
    public void TestTransfer() {
        String contractAddress = "0xd4f1d8fd1d600ff80e7467cd36ee0769b7cd2fbb";
        String amount = "128000000000000000000";
        String toAddress = "0x993f02543f6075031ba5c250ec6d64aad4bdcbc7";

        String hash = iEthService.transfer(contractAddress, toAddress, amount);
        System.out.println(hash);
    }
}
