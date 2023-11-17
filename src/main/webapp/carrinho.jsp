<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Juan Souza, Maria Helena, Pedro Ferreira, Juliana Camargo, Thiago shigueto">
    <title>Cureate</title>
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" />

    <link rel="stylesheet" href="assets/css/style.css">
</head>

<body>

    <section id="header">
                    <a href="index.jsp?id=${param.id}"><img src="assets/img/front-end/logo.png" class="logo" alt=""></a>

                    <div>
                        <ul id="navbar">
                            <li><a href="index.jsp?id=${param.id}">Início</a></li>
                            <li><a href="sobre.jsp?id=${param.id}">Sobre</a></li>
                            <li><a href="contato.jsp?id=${param.id}">Contato</a></li>
                            <li id="lg-bag"><a href="carrinho.jsp?id=${param.id}"><i class="far fa-shopping-bag"></i></a></li>
                            <li id="lg-bag"><a href="/login?id=${param.id}"><i class="fas fa-user"></i></a></li>
                            <li id="lg-bag"><a href="/index.jsp"><i class="fas fa-sign-out"></i></a></li>
                            <a href="#" id="close"><i class="far fa-times"></i></a>
                        </ul>
                    </div>
                    <div id="mobile">
                         <a href="favoritos.jsp?id=${param.id}"><i class="fas fa-heart"></i></a>
                        <a href="carrinho.jsp?id=${param.id}"><i class="far fa-shopping-bag"></i></a>
                        <a href="/login?id=${param.id}"><i class="fas fa-user"></i></a>
                        <a href="/index.jsp"><i class="fas fa-sign-out"></i></a>
                        <i id="bar" class="fas fa-outdent"></i>
                    </div>
                </section>

    <section id="page-header" class="about-header">

        <h2>#carrinho</h2>
        <p>adicione seu cupon e tenha até 70% de desconto!</p>

    </section>

    <section id="cart" class="section-p1">
        <table width="100%">
            <thead>
                <tr>
                    <td>Remover</td>
                    <td>Imagem</td>
                    <td>Produto</td>
                    <td>Preço</td>
                    <td>Quantidade</td>
                    <td>Subtotal</td>
                </tr>
            </thead>

            <tbody>
                <tr>
                    <td><a href="#"><i class="far fa-times-circle"></i></a></td>
                    <td><img src="assets/img/front-end/produtos/tênis/Air Jordan 1 Retro High OG GS Lucky Green/Air Jordan 1 Retro High01.png" alt=""></td>
                    <td>Air Jordan 1 Retro High</td>
                    <td>R$999,99</td>
                    <td><input type="number" value="1" name="" id=""></td>
                    <td>R$999,99</td>
                </tr>
                <tr>
                    <td><a href="#"><i class="far fa-times-circle"></i></a></td>
                    <td><img src="assets/img/front-end/produtos/camisetas/Regata NBA Golden State Warriors/Regata NBA Golden State Warriors01.webp" alt=""></td>
                    <td>Regata NBA Golden State Warriors</td>
                    <td>R$699,99</td>
                    <td><input type="number" value="1" name="" id=""></td>
                    <td>R$699,99</td>
                </tr>
                <tr>
                    <td><a href="#"><i class="far fa-times-circle"></i></a></td>
                    <td><img src="/assets/img/front-end/produtos/tênis/Tênis Nike LeBron 20 Masculino/Tênis Nike LeBron 20 Masculino01.png" alt=""></td>
                    <td>Tênis Nike LeBron 20</td>
                    <td>R$1299,99</td>
                    <td><input type="number" value="1" name="" id=""></td>
                    <td>R$1299,99</td>
                </tr>
            </tbody>
        </table>
    </section>

    <section id="cart-add" class="section-p1">
        <div id="cuopon">
            <h3>Aplicar cupon</h3>
            <div>
                <input type="text" name="" id="" placeholder="Entre com seu cupon">
                <button class="normal">Aplicar</button>
            </div>
        </div>

        <div id="subtotal">
            <h3>Total carrinho</h3>
            <table>
                <tr>
                    <td>Carrinho Subtotal</td>
                    <td>R$ 2.999,97</td>
                </tr>
                <tr>
                    <td>Frete</td>
                    <td>Grátis</td>
                </tr>
                <tr>
                    <td><strong>Total</strong></td>
                    <td><strong>R$ 2.999,97</strong></td>
                </tr>
            </table>
            <button class="normal">Comprar</button>
        </div>
    </section>

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