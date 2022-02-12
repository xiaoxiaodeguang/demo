package com.demo.config;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * 自动生成实体类
 */
public class GeneratorCodeConfig {
    /**
     * 数据源配置
     */
    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:oracle:thin:@10.255.21.70:1521:lsp", "bpmdefccuat", "bpmdefccuat");

    /**
     * 执行 run
     */
    public static void main(String[] args) {
        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
                .globalConfig(builder -> {
                    builder.author("武晓光")               //作者
                            .outputDir(System.getProperty("user.dir")+"/src/main/java")    //输出路径(写到java目录)
                            .enableSwagger()           //开启swagger
                            .disableOpenDir()
                            .commentDate("yyyy-MM-dd")
                            .fileOverride();            //开启覆盖之前生成的文件

                })
                .packageConfig(builder -> builder.parent("com")
                        .moduleName("demo")
                        .entity("entity")
                        .service("service")
                        .serviceImpl("serviceImpl")
                        .controller("controller")
                        .mapper("mapper")
                        .xml("mapper")
                        .pathInfo(Collections.singletonMap(OutputFile.mapperXml,System.getProperty("user.dir")+"\\src\\main\\resources\\mapper")))
                .strategyConfig(builder -> builder.addInclude("HD_PAGE_DEF")
                        .addTablePrefix("HD_")
                        .serviceBuilder()
                        .formatServiceFileName("%sService")
                        .formatServiceImplFileName("%sServiceImpl")
                        .entityBuilder()
                        .enableLombok()
                        .logicDeleteColumnName("deleted")
                        .enableTableFieldAnnotation()
                        .controllerBuilder()
                        .formatFileName("%sController")
                        .enableRestStyle()
                        .mapperBuilder()
                        .enableBaseResultMap()  //生成通用的resultMap
                        .superClass(BaseMapper.class)
                        .formatMapperFileName("%sMapper")
                        .formatXmlFileName("%sMapper"))
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}

