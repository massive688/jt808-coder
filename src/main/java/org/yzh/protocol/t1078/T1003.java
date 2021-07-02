package org.yzh.protocol.t1078;

import io.github.yezhihao.protostar.DataType;
import io.github.yezhihao.protostar.annotation.Field;
import io.github.yezhihao.protostar.annotation.Message;
import org.yzh.protocol.basics.JTMessage;
import org.yzh.protocol.commons.JT1078;

/**
 * @author yezhihao
 * @home https://gitee.com/yezhihao/jt808-server
 */
@Message(JT1078.终端上传音视频属性)
public class T1003 extends JTMessage {

    @Field(index = 0, type = DataType.BYTE, desc = "输入音频编码方式")
    private int audioFormat;
    @Field(index = 1, type = DataType.BYTE, desc = "输入音频声道数")
    private int audioChannels;
    @Field(index = 2, type = DataType.BYTE, desc = "输入音频采样率：0.8kHz 1.22.05kHz 2.44.1kHz 3.48kHz")
    private int audioSamplingRate;
    @Field(index = 3, type = DataType.BYTE, desc = "输入音频采样位数：0.8位 1.16位 2.32位")
    private int audioBitDepth;
    @Field(index = 4, type = DataType.WORD, desc = "音频帧长度")
    private int audioFrameLength;
    @Field(index = 6, type = DataType.BYTE, desc = "是否支持音频输出")
    private int audioSupport;
    @Field(index = 7, type = DataType.BYTE, desc = "视频编码方式")
    private int videoFormat;
    @Field(index = 8, type = DataType.BYTE, desc = "终端支持的最大音频物理通道")
    private int maxAudioChannels;
    @Field(index = 9, type = DataType.BYTE, desc = "终端支持的最大视频物理通道")
    private int maxVideoChannels;

    public int getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(int audioFormat) {
        this.audioFormat = audioFormat;
    }

    public int getAudioChannels() {
        return audioChannels;
    }

    public void setAudioChannels(int audioChannels) {
        this.audioChannels = audioChannels;
    }

    public int getAudioSamplingRate() {
        return audioSamplingRate;
    }

    public void setAudioSamplingRate(int audioSamplingRate) {
        this.audioSamplingRate = audioSamplingRate;
    }

    public int getAudioBitDepth() {
        return audioBitDepth;
    }

    public void setAudioBitDepth(int audioBitDepth) {
        this.audioBitDepth = audioBitDepth;
    }

    public int getAudioFrameLength() {
        return audioFrameLength;
    }

    public void setAudioFrameLength(int audioFrameLength) {
        this.audioFrameLength = audioFrameLength;
    }

    public int getAudioSupport() {
        return audioSupport;
    }

    public void setAudioSupport(int audioSupport) {
        this.audioSupport = audioSupport;
    }

    public int getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(int videoFormat) {
        this.videoFormat = videoFormat;
    }

    public int getMaxAudioChannels() {
        return maxAudioChannels;
    }

    public void setMaxAudioChannels(int maxAudioChannels) {
        this.maxAudioChannels = maxAudioChannels;
    }

    public int getMaxVideoChannels() {
        return maxVideoChannels;
    }

    public void setMaxVideoChannels(int maxVideoChannels) {
        this.maxVideoChannels = maxVideoChannels;
    }
}