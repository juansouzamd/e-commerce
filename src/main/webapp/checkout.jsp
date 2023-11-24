<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
    <link rel="stylesheet" href="assets/css/checkout.css">
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



<div class="container">

    <div class="card-container">

        <div class="front">
            <div class="image">
                <img src="assets/img/front-end/checkout/chip.png" alt="">
                <img src="assets/img/front-end/checkout/visa.png" alt="">
            </div>
            <div class="card-number-box">################</div>
            <div class="flexbox">
                <div class="box">
                    <span>titular do cartão</span>
                    <div class="card-holder-name">nome completo</div>
                </div>
                <div class="box">
                    <span>expira</span>
                    <div class="expiration">
                        <span class="exp-month">mês</span>
                        <span class="exp-year">ano</span>
                    </div>
                </div>
            </div>
        </div>

        <div class="back">
            <div class="stripe"></div>
            <div class="box">
                <span>cvv</span>
                <div class="cvv-box"></div>
                <img src="assets/img/front-end/checkout/visa.png" alt="">
            </div>
        </div>

    </div>

    <form action="/pedido" method="post">
        <div class="inputBox">
            <span><Nav>número do cartão</Nav></span>
            <input type="text" maxlength="16" class="card-number-input" name="numero-cartao" id="numero-cartao" required>
        </div>
        <div class="inputBox">
            <span>titular do cartão</span>
            <input type="text" class="card-holder-input" name="titular" id="titular" required>
        </div>
        <div class="flexbox">
            <div class="inputBox">
                <span>mês expiração</span>
                <select name="mes" id="mes" class="month-input" required>
                    <option value="month" selected disabled>mês</option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                </select>
            </div>
            <div class="inputBox">
                <span>ano expiração</span>
                <select name="ano" id="ano" class="year-input" required>
                    <option value="year" selected disabled>ano</option>
                    <option value="2024">2024</option>
                    <option value="2025">2025</option>
                    <option value="2026">2026</option>
                    <option value="2027">2027</option>
                    <option value="2028">2028</option>
                    <option value="2029">2029</option>
                    <option value="2030">2030</option>
                    <option value="2030">2031</option>
                    <option value="2030">2032</option>
                    <option value="2030">2033</option>
                </select>
            </div>
            <div class="inputBox">
                <span>cvv</span>
                <input type="text" maxlength="3" class="cvv-input" name="cvv" id="cvv" required>
            </div>
        </div>

        <section class="enderecos">
         <c:forEach var="endereco" items="${enderecos}">
                <h3 class="h33">Selecione o endereço de entrega:</h3>

                <div class="endereco-option">
                    <input type="radio" id="opcaoEndereco" name="opcaoEndereco" value="${endereco.rua} ${endereco.numero}" required class="rua">
                    <label class="end">${endereco.rua}, ${endereco.numero}</label>
                </div>
        </c:forEach>

        </section>

        <input type="submit" value="comprar" class="submit-btn">
    </form>

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
<script src="assets/js/checkout.js"></script>
</body>

</html>