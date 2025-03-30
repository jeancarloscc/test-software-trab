package com.test.trabalho.jc;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testMain() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));

            Page page = browser.newPage();
            page.navigate("https://pt.anotepad.com");

            String tituloNota = "Entrega trabalho TEST DAS 2024";
            page.getByPlaceholder("Título da Nota").fill(tituloNota);

            String conteudoNota = "Nome: Jean\nMatrícula: 202400184590";
            page.getByPlaceholder("Conteúdo da Nota").fill(conteudoNota);

            String tituloReal = page.getByPlaceholder("Título da Nota").inputValue();
            String corpoReal = page.getByPlaceholder("Conteúdo da Nota").inputValue();

            assertEquals(tituloNota, tituloReal);
            assertEquals(conteudoNota, corpoReal);

            browser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}