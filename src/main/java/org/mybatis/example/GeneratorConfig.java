package org.mybatis.example;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorConfig {

    public static void main(String[] args) throws Exception {
        
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        
        // 指定逆向工程配置文件
        ClassLoader classLoader = GeneratorConfig.class.getClassLoader();
        URL url = classLoader.getResource("generatorConfig.xml");
        File configFile = new File(url.getFile());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

}
