package com.example.springbootREST.config;

import com.example.springbootREST.enuns.Raca;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.PackageVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class Jackson {
    @Bean
    public ObjectMapper objectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();

        //Propriedades não mapeadas não quebram
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        //Falha se alguma propriedade estiver vazia
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        //Serve para compatibilidadede arrays, quando tem um array com um item , caso não tenha essa config ele se perde
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        //Serelize datas
        objectMapper.registerModule(new JavaTimeModule());
//        objectMapper.registerModule(racaModuleMapper());

        return objectMapper;

    }

    public SimpleModule racaModuleMapper(){
        SimpleModule simpleModule = new SimpleModule("JSONRacaModule", PackageVersion.VERSION);

        simpleModule.addSerializer(Raca.class, new RacaSerialize());
        simpleModule.addDeserializer(Raca.class, new RacaDeserialize());

        return simpleModule;
    }

    class RacaSerialize extends StdSerializer<Raca>{
        public RacaSerialize(){
            super((Raca.class));
        }

        @Override
        public void serialize(Raca value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString(value.getValue());
        }
    }

    class RacaDeserialize extends StdDeserializer<Raca>{

        public RacaDeserialize(){
            super(Raca.class);
        }

        @Override
        public Raca deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return Raca.of(p.getText());
        }


    }
}
