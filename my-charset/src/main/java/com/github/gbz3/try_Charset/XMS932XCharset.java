package com.github.gbz3.try_Charset;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class XMS932XCharset extends Charset {

    protected XMS932XCharset(String canonicalName, String[] aliases) {
        super(canonicalName, aliases);
    }

    @Override
    public boolean contains(Charset charset) {
        return charset instanceof XMS932XCharset;
    }

    @Override
    public CharsetDecoder newDecoder() {
        return new XMS932XDecoder(this, (float) 2, (float) 2);
    }

    @Override
    public CharsetEncoder newEncoder() {
        return new XMS932XEncoder(this, (float) 2, (float) 2);
    }
}
