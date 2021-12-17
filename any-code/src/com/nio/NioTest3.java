package com.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.ByteChannel;

/**
 * <p>Description: </p>

 *
 * 
 * @version 0.0.1
 * @date 2020/5/8
 */
public class NioTest3 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");

        //写入字节

        ByteChannel byteChannel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        byteBuffer.put("Helllo World, i am nio".getBytes());

        //byteBuffer 的position=上面字符长度、limit=capacity

        byteBuffer.position(1);
        byteBuffer.limit(10);
        //write之前需要将position、limit位置设置正确，即position位置=0,limit=position的位置

        byteChannel.write(byteBuffer);

        fileOutputStream.close();

        IntBuffer intBuffer=IntBuffer.allocate(-1);

    }
}
