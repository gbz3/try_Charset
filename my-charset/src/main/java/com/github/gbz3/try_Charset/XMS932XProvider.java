package com.github.gbz3.try_Charset;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.Iterator;
import java.util.List;

public class XMS932XProvider extends CharsetProvider {
    private final List<Charset> charsets = List.of(new XMS932XCharset("XMS932X", new String[] {}));

    @Override
    public Iterator<Charset> charsets() {
        return charsets.iterator();
    }

    @Override
    public Charset charsetForName(String s) {
        return "XMS932X".equals(s) ? charsets.get(0) : null;
    }
}
