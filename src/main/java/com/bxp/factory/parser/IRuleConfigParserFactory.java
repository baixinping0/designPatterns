package com.bxp.factory.parser;

import java.util.HashMap;

/**
 * Author:  baixinping
 * Date:  2020-11-23
 * Description：
 */
public class IRuleConfigParserFactory {
    private static final HashMap<String, IRuleConfigParser> map = new HashMap<String, IRuleConfigParser>();
    static {
        map.put("json", new JsonRuleConfigParser());
        map.put("xml", new XmlRuleConfigParser());
        map.put("properties", new PropertiesRuleConfigParser());
    }

    public IRuleConfigParser create2(String configFormat){
        return map.get(configFormat);
    }


    /**
     * 简单工厂，需要的时候再创建
     * @param configFormat
     * @return
     */
    public IRuleConfigParser create(String configFormat){
        IRuleConfigParser parser = null;
        if (configFormat.endsWith(".json")){
            parser = new JsonRuleConfigParser();
        }else if (configFormat.endsWith(".xml")){
            parser = new XmlRuleConfigParser();
        }else if (configFormat.endsWith(".properties")){
            parser = new PropertiesRuleConfigParser();
        }else {
            throw new RuntimeException("");
        }
        return  parser;
    }


}
