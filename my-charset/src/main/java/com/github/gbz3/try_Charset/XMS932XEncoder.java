package com.github.gbz3.try_Charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class XMS932XEncoder extends CharsetEncoder {

    protected XMS932XEncoder(Charset cs, float averageBytesPerChar, float maxBytesPerChar) {
        super(cs, averageBytesPerChar, maxBytesPerChar);
    }

    @Override
    protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {
        var charset = Charset.forName("MS932");
        var encoder = charset.newEncoder();
        encoder.reset();
        return encoder.encode(in, out, false);
    }
}
