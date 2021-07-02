package org.yzh.protocol.t808;

import io.github.yezhihao.protostar.DataType;
import io.github.yezhihao.protostar.annotation.Field;
import io.github.yezhihao.protostar.annotation.Message;
import org.yzh.protocol.basics.JTMessage;
import org.yzh.protocol.commons.JT808;

/**
 * @author yezhihao
 * @home https://gitee.com/yezhihao/jt808-server
 */
@Message(JT808.驾驶员身份信息采集上报)
public class T0702 extends JTMessage {

    @Field(index = 0, type = DataType.BYTE, desc = "状态")
    private int status;
    @Field(index = 1, type = DataType.BCD8421, length = 6, desc = "时间")
    private String dateTime;
    @Field(index = 7, type = DataType.BYTE, desc = "IC卡读取结果")
    private int cardStatus;
    @Field(index = 8, type = DataType.STRING, lengthSize = 1, desc = "驾驶员姓名")
    private String name;
    @Field(index = 9, type = DataType.STRING, length = 20, desc = "从业资格证编码")
    private String licenseNo;
    @Field(index = 29, type = DataType.STRING, lengthSize = 1, desc = "从业资格证发证机构名称")
    private String institution;
    @Field(index = 30, type = DataType.BCD8421, length = 4, desc = "证件有效期")
    private String licenseValidPeriod;
    @Field(index = 34, type = DataType.STRING, length = 4, desc = "驾驶员身份证号", version = 1)
    private String idCard;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(int cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getLicenseValidPeriod() {
        return licenseValidPeriod;
    }

    public void setLicenseValidPeriod(String licenseValidPeriod) {
        this.licenseValidPeriod = licenseValidPeriod;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}