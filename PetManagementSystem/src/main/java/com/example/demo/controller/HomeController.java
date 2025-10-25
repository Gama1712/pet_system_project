package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return """
            <html>
            <head>
                <title>Pet Management System</title>
                <style>
                    body { font-family: Arial, sans-serif; margin: 40px; background-color: #f5f5f5; }
                    .container { max-width: 800px; margin: 0 auto; background: white; padding: 30px; border-radius: 10px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
                    h1 { color: #2c3e50; text-align: center; }
                    .api-section { margin: 20px 0; padding: 20px; background: #ecf0f1; border-radius: 5px; }
                    .endpoint { margin: 10px 0; padding: 10px; background: white; border-left: 4px solid #3498db; }
                    .method { font-weight: bold; color: #27ae60; }
                    .url { font-family: monospace; color: #e74c3c; }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>🐾 Pet Management System</h1>
                    <p>Добро пожаловать в систему управления домашними животными!</p>
                    
                    <div class="api-section">
                        <h2>📋 Доступные API endpoints:</h2>
                        
                        <div class="endpoint">
                            <span class="method">GET</span> <span class="url">/pet/all</span><br>
                            Получить список всех питомцев
                        </div>
                        
                        <div class="endpoint">
                            <span class="method">POST</span> <span class="url">/pet/added</span><br>
                            Добавить нового питомца (JSON в теле запроса)
                        </div>
                        
                        <div class="endpoint">
                            <span class="method">PUT</span> <span class="url">/pet/update/{id}</span><br>
                            Обновить информацию о питомце по ID
                        </div>
                        
                        <div class="endpoint">
                            <span class="method">DELETE</span> <span class="url">/pet/deleted/{id}</span><br>
                            Удалить питомца по ID
                        </div>
                    </div>
                    
                    <div class="api-section">
                        <h2>🔧 Полезные ссылки:</h2>
                        <p>• <a href="/h2-console" target="_blank">H2 Database Console</a> (для просмотра базы данных)</p>
                        <p>• <a href="/pet/all">Список всех питомцев</a></p>
                    </div>
                    
                    <div class="api-section">
                        <h2>📝 Пример JSON для добавления питомца:</h2>
                        <pre style="background: #2c3e50; color: #ecf0f1; padding: 15px; border-radius: 5px; overflow-x: auto;">
{
  "name": "Барсик",
  "age": 3,
  "breed": "Персидская",
  "description": "Дружелюбный кот"
}</pre>
                    </div>
                </div>
            </body>
            </html>
            """;
    }
}
