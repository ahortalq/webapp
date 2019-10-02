package com.xebialabs.congruencias.webapp;

public class Utils {
    
    public static String getHeader() {
        String header = "";
        header = header + "<!doctype html>";
        header = header + "<html lang=\"en\">";
        header = header + "  <head><title>Calculadora matemática</title>";
        header = header + "    <meta charset=\"utf-8\">";
        header = header + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">";
        header = header + "    <meta name=\"description\" content=\"\">";
        header = header + "    <meta name=\"author\" content=\"\">";
        header = header + "    <link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\">";
        header = header + "    <link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\">";
        header = header + "    <title>Signin Template for Bootstrap</title>";
        header = header + "    <!-- Bootstrap core CSS -->";
        header = header + "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">";
        header = header + "    <!-- Custom styles for this template -->";
        header = header + "    <link href=\"css/signin.css\" rel=\"stylesheet\">";
        header = header + "  </head>";
        header = header + "  <body class=\"text-center\">";
        return header;
    }

    public static String getFooter() {
        String footer = "";
        footer = footer + "  </body>";
        footer = footer + "</html>";
        return footer;
    }

    public static String getCng000() {
        String template = getHeader();
        //Comentarios
        template = template + "    <form class=\"form-signin\" name=\"form01\" method=\"post\" action=\"validaUsuario\">";
        template = template + "      <h1 class=\"h3 mb-3 font-weight-normal color-white\">";
        template = template + "      <font color=\"orange\">Bienvenido a la calculadora matemática</font>";
        template = template + "      </h1>";
        // template = template + "      <img class=\"mb-4\" src=\"images/com.calc.scientific.png\" alt=\"\" width=\"92\" height=\"92\">";
        template = template + "      <h1 class=\"h3 mb-3 font-weight-normal\"></h1>";
        template = template + "      <input type=\"text\" name=\"login\" size=\"25\" id=\"inputEmail\" class=\"form-control\" placeholder=\"User\" required autofocus>";
        template = template + "      <input type=\"password\" name=\"password\" size=\"25\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required>";
        template = template + "      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Enviar</button>";
        template = template + "      <h1 class=\"h5 mb-3 font-weight-normal\"></h1>";
        template = template + "      <p class=\"mt-5 mb-3 text-muted color-white\">&copy; 2019</p>";
        template = template + "    </form>";
        return template + getFooter();
    }

    public static String getCng0011(String login) {
        String template = getHeader();
        template = template + "    <form class=\"form-signin\" name=\"form01\" method=\"post\" action=\"paginaInicialCongruencias\">";
        template = template + "      <h1 class=\"h3 mb-3 font-weight-normal color-white\">Hola " + login + "!,<br>Vamos a hacer algunos cálculos</h1>";
        // template = template + "      <img class=\"mb-4\" src=\"images/mathematics.jpg\" alt=\"\" width=\"200\" height=\"200\">";
        template = template + "      <h1 class=\"h3 mb-3 font-weight-normal\"></h1>";
        template = template + "      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Comenzar!</button>";
        template = template + "      <h1 class=\"h5 mb-3 font-weight-normal\"></h1>";
        template = template + "      <p class=\"mt-5 mb-3 text-muted color-white\">&copy; 2019</p>";
        template = template + "    </form>";
        return template + getFooter();
    }

    public static String getCng0012(String login) {
        String template = getHeader();
        template = template + "    <form class=\"form-signin\" name=\"form01\" method=\"post\" action=\"index\">";
        template = template + "      <h1 class=\"h3 mb-3 font-weight-normal color-white\">Amigo " + login + "</h1>";
        // template = template + "      <img class=\"mb-4\" src=\"images/prohibido_paso.jpg\" alt=\"\" width=\"200\" height=\"200\">";
        template = template + "      <h1 class=\"h3 mb-3 font-weight-normal color-white\">Lo sentimos pero no estás autorizado</h1>";
        template = template + "      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Volver al inicio</button>";
        template = template + "      <h1 class=\"h5 mb-3 font-weight-normal\"></h1>";
        template = template + "      <p class=\"mt-5 mb-3 text-muted color-white\">&copy; 2019</p>";
        template = template + "    </form>";
        return template + getFooter();
    }

    public static String getCng002() {
        String template = getHeader();
        // template = template + "    <form class=\"form-signin\" name=\"form01\" method=\"post\" action=\"calculaCongruencia\">";
        // template = template + "      <h1 class=\"h3 mb-3 font-weight-normal\">¿El número ...</h1>";
        // template = template + "      <input type=\"text\" name=\"a\" size=\"5\" class=\"form-control\" placeholder=\"Number\" required autofocus>";
        // template = template + "      <h1 class=\"h3 mb-3 font-weight-normal\">... es congruente con ...</h1>";
        // template = template + "      <input type=\"text\" name=\"b\" size=\"5\" class=\"form-control\" placeholder=\"Number\" required autofocus>";
        // template = template + "      <h1 class=\"h3 mb-3 font-weight-normal\">... módulo ...</h1>";
        // template = template + "      <input type=\"text\" name=\"c\" size=\"5\" class=\"form-control\" placeholder=\"Number\" required autofocus>";
        // template = template + "      <h1 class=\"h5 mb-3 font-weight-normal\"></h1>";
        // template = template + "      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Calcular!</button>";
        // template = template + "      <h1 class=\"h5 mb-3 font-weight-normal\"></h1>";
        // template = template + "    </form>";
        // template = template + "    <h1 class=\"h1 mb-3 font-weight-normal\"></h1>";
        template = template + "    <form class=\"form-signin\" name=\"form02\" method=\"post\" action=\"calculaParidad\">";
        template = template + "      <h1 class=\"h3 mb-3 font-weight-normal color-white\">El número ...</h1>";
        template = template + "      <input type=\"text\" name=\"a\" size=\"5\" class=\"form-control\" placeholder=\"Number\" required autofocus>";
        template = template + "      <h1 class=\"h5 mb-3 font-weight-normal\"></h1>";
        template = template + "      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">¿Es par?</button>";
        template = template + "      <h1 class=\"h5 mb-3 font-weight-normal\"></h1>";
        template = template + "      <p class=\"mt-5 mb-3 text-muted color-white\">&copy; 2019</p>";
        template = template + "    </form>";
        return template + getFooter();
    }

    public static String getCng005(String msg, String img) {
        String template = getHeader();
        template = template + "    <form class=\"form-signin\" name=\"form01\" method=\"post\" action=\"paginaInicialCongruencias\">";
        template = template + "      <h1 class=\"h3 mb-3 font-weight-normal color-white\">" + msg +"</h1>";
        // template = template + "      <img class=\"mb-4\" src=\"" + img + "\" alt=\"\" width=\"200\" height=\"200\">";
        template = template + "      <h1 class=\"h5 mb-3 font-weight-normal\"></h1>";
        template = template + "      <button class=\"btn btn-lg btn-primary btn-block \" type=\"submit\">Más cálculos!</button>";
        template = template + "      <h1 class=\"h5 mb-3 font-weight-normal\"></h1>";
        template = template + "      <p class=\"mt-5 mb-3 text-muted color-white\">&copy; 2019</p>";
        template = template + "    </form>";
        return template + getFooter();
    }

}
