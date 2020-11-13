package com.bxp.factory.parser;

import com.bxp.factory.RuleConfig;

import java.io.File;

/**
 * Author:  baixinping
 * Date:  2020-11-12
 * Description：
 */
public interface IRuleConfigParser {
    RuleConfig parse(File file);
}
