package com.example.common;

/**
 * Created by YAO on 2017-03-08.
 */

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Json序列华全局配置(主要解决Long型转String)
 */
public class ObjectMappingCustomer extends ObjectMapper
{
    private static final long serialVersionUID = 4402127997078513582L;

    public ObjectMappingCustomer()
    {
        super();
        //设置null值不参与序列化(字段不被显示)
        //this.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
        // 允许单引号
        //this.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        // 字段和值都加引号
        //this.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        // 数字也加引号
        this.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        this.configure(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS, true);
        // 空值处理为空串
//        this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>()
//        {
//
//            @Override
//            public void serialize(
//                    Object value,
//                    JsonGenerator jg,
//                    SerializerProvider sp) throws IOException, JsonProcessingException
//            {
//                jg.writeString("");
//            }
//        });

    }
}
