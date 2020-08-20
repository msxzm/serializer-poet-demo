package com.msxzm.core;

import com.msxzm.base.serializer.ISerializable;
import com.msxzm.base.serializer.Serializable;
import com.msxzm.base.serializer.SerializerField;
import com.msxzm.base.stream.InputStream;
import com.msxzm.base.stream.OutputStream;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 序列化示例
 * @author zenghongming
 * @date 2020/8/20 11:36
 */
@Serializable
public class SerializerDemo implements ISerializable {
    @SerializerField
    private int a;
    @SerializerField
    private long b;
    @SerializerField
    private String c;
    @SerializerField
    private List<Integer> d;
    @SerializerField
    private Map<Integer, Integer> e;
    @SerializerField
    private List<List<Integer>> f;
    @SerializerField
    private Map<Integer, List<Integer>> g;
    @SerializerField
    private int[] h;
    @SerializerField
    private SerializableObject i;

    @Override
    public void doWrite(OutputStream outputStream) throws IOException {

    }

    @Override
    public void doRead(InputStream inputStream) throws IOException {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public List<Integer> getD() {
        return d;
    }

    public void setD(List<Integer> d) {
        this.d = d;
    }

    public Map<Integer, Integer> getE() {
        return e;
    }

    public void setE(Map<Integer, Integer> e) {
        this.e = e;
    }

    public List<List<Integer>> getF() {
        return f;
    }

    public void setF(List<List<Integer>> f) {
        this.f = f;
    }

    public Map<Integer, List<Integer>> getG() {
        return g;
    }

    public void setG(Map<Integer, List<Integer>> g) {
        this.g = g;
    }

    public int[] getH() {
        return h;
    }

    public void setH(int[] h) {
        this.h = h;
    }

    public SerializableObject getI() {
        return i;
    }

    public void setI(SerializableObject i) {
        this.i = i;
    }
}
