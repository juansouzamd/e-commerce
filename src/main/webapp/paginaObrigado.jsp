<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!DOCTYPE html>
    <html lang="pt-BR">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <meta name="author" content="Juan Souza, Maria Helena, Pedro Ferreira, Juliana Camargo, Thiago shigueto">
            <title>Cureate</title>
            <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" />

            <link rel="stylesheet" href="assets/css/style.css">
            <link rel="stylesheet" href="assets/css/usuario.css">
        </head>

        <body>

            <section id="header">
                                <a href="/listar-produtos"><img src="assets/img/front-end/logo.png" class="logo" alt=""></a>

                                <div>
                                    <ul id="navbar">
                                        <li><a href="/listar-produtos">Início</a></li>
                                        <li><a href="sobre.jsp">Sobre</a></li>
                                        <li><a href="contato.jsp">Contato</a></li>
                                        <li id="lg-bag"><a href="/exibir-carrinho"><i class="far fa-shopping-bag"></i></a></li>
                                        <li id="lg-bag"><a href="/login?id=${param.id}"><i class="fas fa-user"></i></a></li>
                                        <li id="lg-bag"><a href="/logout"><i class="fas fa-sign-out"></i></a></li>
                                        <a href="#" id="close"><i class="far fa-times"></i></a>
                                    </ul>
                                </div>
                                <div id="mobile">
                                    <a href="carrinho.jsp"><i class="far fa-shopping-bag"></i></a>
                                    <a href="/login"><i class="fas fa-user"></i></a>
                                    <a href="/logout"><i class="fas fa-sign-out"></i></a>
                                    <a href="/logout"><i id="bar" class="fas fa-outdent"></i></a>
                                </div>
                            </section>


            <section id="product1" class="section-p1">
                <h2>Compra realizada com sucesso!!</h2>
                <p>Clique no botão abaixo para acompanhar seus pedidos</p>
            </section>

            <div class="botoes botaoObrigado">
                <a href="/get-enderecos"><input type="submit" class="btn bo" value="Ver meus pedidos"/></a>
            </div>

            <section id="newsletter" class="section-p1 section-m1">
                <div class="newstext">
                    <h4>Seja o primeiro a saber</h4>
                    <p>Receba as novidades da nossa loja e saiba antes dos <span>futuros lançamentos!</span> </p>
                </div>
                <div class="form">
                    <input type="text" placeholder="Digite seu e-mail">
                    <button class="normal">Enviar</button>
                </div>
            </section>

            <footer class="section-p1">
                <div class="col">
                    <img class="logo" src="img/cureate01.png" alt="">
                    <h4>Contato</h4>
                    <p><strong>Endereço: </strong> Av. Eng. Eusébio Stevaux, 823</p>
                    <p><strong>Telefone:</strong> 11 99999-9999</p>
                    <div class="follow">
                        <h4>Siga!</h4>
                        <div class="icon">
                            <i class="fab fa-facebook-f"></i>
                            <i class="fab fa-twitter"></i>
                            <i class="fab fa-instagram"></i>
                            <i class="fab fa-pinterest-p"></i>
                            <i class="fab fa-youtube"></i>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <h4>Sobre</h4>
                    <a href="#">Sobre a empresa</a>
                    <a href="#">Informações de entregas</a>
                    <a href="#">Política e privacidade</a>
                    <a href="#">Termos e condições</a>
                    <a href="#">Entre em contato</a>
                </div>

                <div class="col">
                    <h4>Minha conta</h4>
                    <a href="#">Entrar</a>
                    <a href="#">Ver carrinho</a>
                    <a href="#">Meus favoritos</a>
                    <a href="#">Meus pedidos</a>
                    <a href="#">Ajuda</a>
                </div>

                <div class="col install">
                    <h4>Baixe nosso app</h4>
                    <p>Disponível em App Store e Google Play</p>
                    <div class="row">
                        <img src="assets/img/front-end/pagamentos/app.jpg" alt="">
                        <img src="assets/img/front-end/pagamentos/play.jpg" alt="">
                    </div>
                    <p>Formas de pagamento</p>
                    <img src="assets/img/front-end/pagamentos/pay.png" alt="">
                </div>

                <div class="copyright">
                    <p>© 2023, Senac - E-commerce projeto integrador</p>
                </div>
            </footer>


            <script src="assets/js/script.js"></script>
        </body>

    </html>