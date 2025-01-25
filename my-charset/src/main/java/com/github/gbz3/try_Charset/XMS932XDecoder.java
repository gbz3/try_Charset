package com.github.gbz3.try_Charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public class XMS932XDecoder extends CharsetDecoder {

    protected XMS932XDecoder(Charset cs, float averageCharsPerByte, float maxCharsPerByte) {
        super(cs, averageCharsPerByte, maxCharsPerByte);
    }

    @Override
    protected CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
        var charset = Charset.forName("MS932");
        var decoder = charset.newDecoder();
        decoder.reset();
        return decoder.decode(in, out, true);
    }
}
