package com.test.trabalho.jc;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.test.trabalho.jc.entidade.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.webkit()
                    .launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://pt.anotepad.com/");
            System.out.println(page.title());

            page.getByPlaceholder("Título da Nota").fill("Entrega trabalho TEST DAS 2024");
            page.getByPlaceholder("Conteúdo da Nota").fill("Nome: Jean\nMatrícula: 202400184590");

            browser.close();

            System.out.println("Automação finalizada com sucesso!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

