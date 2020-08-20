package com.msxzm.core;

import com.msxzm.base.serializer.ISerializable;
import com.msxzm.base.serializer.Serializable;
import com.msxzm.base.serializer.SerializerField;
import com.msxzm.base.stream.InputStream;
import com.msxzm.base.stream.OutputStream;

import java.io.IOException;

/**
 * 可序列化的对象
 * @author zenghongming
 * @date 2020/8/20 11:35
 */
@Serializable
public class SerializableObject implements ISerializable {
    @SerializerField
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public SerializableObject() {
    }

    @Override
    public void doWrite(OutputStream outputStream) throws IOException {

    }

    @Override
    public void doRead(InputStream inputStream) throws IOException {

    }
}
