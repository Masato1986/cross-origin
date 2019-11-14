package com.example.server.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * TODO server-2
 * アプリケーション全体で CORS の設定をする場合は、Java Config を利用します。
 * WebMvcConfigurerインタフェースを実装してWeb関連の設定をカスタマイズします。
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /*
     * TODO server-3
     * CORS関連の設定は addCorsMappings メソッドをオーバライドして設定します。
     * 引数の CorsRegistry に設定を追加していく形になります。
     * 下記では、/api/** にマッチするリクエストに対して、
     * Origin : http://localhost:4200 からのリクエストを許容しています。
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:4200");
    }
}
