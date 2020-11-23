package com.bxp.factory;

import com.bxp.factory.parser.*;

import java.io.File;

/**
 * Author:  baixinping
 * Date:  2020-11-12
 * Description：
 */
public class RuleConfigSource {
    public RuleConfig load(File file){
        String fileName = file.getName();

        IRuleConfigParserFactory factory = new IRuleConfigParserFactory();
        IRuleConfigParser parser =factory.create(fileName);

        return parser.parse(file);
    }
}
