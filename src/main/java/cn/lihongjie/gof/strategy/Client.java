package cn.lihongjie.gof.strategy;

import java.io.File;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        CompressionContext ctx = new CompressionContext();
        //we could assume context is already set by preferences
        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        //get a list of files...
        ArrayList<File> files = new ArrayList<>();
        ctx.createArchive(files);
    }
}
