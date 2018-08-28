package cn.ganzhiqiang.email;

import org.junit.Before;
import org.junit.Test;

import javax.mail.MessagingException;
import java.security.GeneralSecurityException;

import static cn.ganzhiqiang.email.EmailUtil.SMTP_QQ;

public class EmailUtilTest {

    @Before
    public void before() throws GeneralSecurityException {
        // 配置，一次即可
        EmailUtil.config(SMTP_QQ(false), "2582654085@qq.com", "dzdcmbfghbomeadg");
    }

    @Test
    public void testSendText() throws MessagingException {
        EmailUtil.subject("这是一封测试TEXT邮件")
                .from("甘志强的QQ邮箱")
                .to("2715815264@qq.com")
                .text("信件内容")
                .send();
    }

}