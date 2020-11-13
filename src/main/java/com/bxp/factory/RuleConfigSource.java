package com.bxp.factory;

import com.bxp.factory.parser.IRuleConfigParser;
import com.bxp.factory.parser.JsonRuleConfigParser;
import com.bxp.factory.parser.PropertiesRuleConfigParser;
import com.bxp.factory.parser.XmlRuleConfigParser;

import java.io.File;

/**
 * Author:  baixinping
 * Date:  2020-11-12
 * Description：
 */
public class RuleConfigSource {
    public RuleConfig load(File file){
        String fileName = file.getName();
        IRuleConfigParser parser = null;
        if (fileName.endsWith(".json")){
            parser = new JsonRuleConfigParser();
        }else if (fileName.endsWith(".xml")){
            parser = new XmlRuleConfigParser();
        }else if (fileName.endsWith(".properties")){
            parser = new PropertiesRuleConfigParser();
        }else {
            throw new RuntimeException("");
        }
        return parser.parse(file);
    }
}
