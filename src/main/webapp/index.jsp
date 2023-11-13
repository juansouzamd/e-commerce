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
        <a href="index.jsp"><img src="assets/img/front-end/logo.png" class="logo" alt=""></a>

        <div>
            <ul id="navbar">
<<<<<<< HEAD
                <li><a href="#">Produtos</a></li>
                <li><a href="create-car.jsp">Sobre</a></li>
=======
                <li><a href="index.jsp">Início</a></li>
                <li><a href="sobre.jsp">Sobre</a></li>
>>>>>>> 84a80dfc28dce5a2d85940e873d507e18b8e8f78
                <li><a href="contato.jsp">Contato</a></li>
                <li id="lg-bag"><a href="favoritos.jsp"><i class="fas fa-heart"></i></a></li>
                <li id="lg-bag"><a href="carrinho.jsp"><i class="far fa-shopping-bag"></i></a></li>
                <li id="lg-bag"><a href="paginaLogin.jsp"><i class="fas fa-user"></i></a></li>
                <a href="#" id="close"><i class="far fa-times"></i></a>
            </ul>
        </div>
        <div id="mobile">
             <a href="favoritos.jsp"><i class="fas fa-heart"></i></a>
            <a href="carrinho.jsp"><i class="far fa-shopping-bag"></i></a>
            <a href="paginaLogin.jsp"><i class="fas fa-user"></i></a>
            <i id="bar" class="fas fa-outdent"></i>
        </div>
    </section>

    <section id="hero">
    </section>

    <section id="feature" class="section-p1">
        <div class="fe-box">
            <img src="assets/img/front-end/caracteristicas/f1.png" alt="">
            <h6>Frete grátis</h6>
        </div>
        <div class="fe-box">
            <img src="assets/img/front-end/caracteristicas/f2.png" alt="">
            <h6>Entrega rápida</h6>
        </div>
        <div class="fe-box">
            <img src="assets/img/front-end/caracteristicas/f3.png" alt="">
            <h6>Economize dinheiro</h6>
        </div>
        <div class="fe-box">
            <img src="assets/img/front-end/caracteristicas/f4.png" alt="">
            <h6>Promoções</h6>
        </div>
        <div class="fe-box">
            <img src="assets/img/front-end/caracteristicas/f5.png" alt="">
            <h6>Pós-venda</h6>
        </div>
        <div class="fe-box">
            <img src="assets/img/front-end/caracteristicas/f6.png" alt="">
            <h6>Suporte 24/7</h6>
        </div>
    </section>

    <section id="product1" class="section-p1">
        <h2>Produtos em destaque</h2>
        <p>Desenvolvidos para seu maior conforto</p>
        <div class="pro-container">
            <div class="pro">
                <a href="produto.jsp" class="decoration">
                    <img src="assets/img/front-end/produtos/tênis/Tênis Nike Precision 6 Masculino/Nike Precision01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis Nike Precision 6</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$479,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/tênis/LeBron NXXT Gen/LeBron NXXT Gen01.png" alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis LeBron NXXT Gen</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$1299,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/tênis/Tênis Jordan MVP Masculino/Tênis Jordan MVP Masculino01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis Jordan MVP</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$999,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/tênis/Tênis Nike Precision 6 FlyEase Masculino/Tênis Nike Precision 6 FlyEase Masculino01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis Nike Precision 6 FlyEase</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$679,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/tênis/Tênis Nike Air Force 1 '07 Masculino/Tênis Nike Air Force01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis Nike Air Force</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$799,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/tênis/Air Jordan 1 Retro High OG GS Lucky Green/Air Jordan 1 Retro High01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis Air Jordan 1 Retro High</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$999,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/tênis/Tênis Nike LeBron 20 Masculino/Tênis Nike LeBron 20 Masculino01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis Nike LeBron 20</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$1299,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/tênis/Tênis Nike Giannis Immortality 3 Masculino/Tênis Nike Giannis Immortality 3 Masculino01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis Nike Giannis Immortality</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$1699,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
        </div>
    </section>

    <section id="banner" class="section-m1">
        <h2>Agora <span>50% de desconto</span> - todos os tênis & camisetas</h2>
        <button class="normal">Explorar mais</button>
    </section>

    <section id="product1" class="section-p1">
        <h2>Lançamentos</h2>
        <p>Coleções desenvolvidas seguindo atletas campeões</p>
        <div class="pro-container">
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/camisetas/Camiseta Nike Brasil I/Camiseta Nike Brasil I01.jpg"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Camiseta Nike Brasil I</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$249,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/camisetas/Camiseta Nike Brasil II/Camiseta Nike Brasil II01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Camiseta Nike Brasil II</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$249,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/camisetas/Camisa Nike Corinthians I/Camisa Nike Corinthians I01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Camisa Nike Corinthians I</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$249,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/camisetas/Camisa Nike Corinthians II/Camisa Nike Corinthians II01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Camisa Nike Corinthians II</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$249,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/camisetas/Regata NBA Golden State Warriors/Regata NBA Golden State Warriors01.webp"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Regata NBA Golden State Warriors</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$699,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/camisetas/Regata NBA Los Angeles Lakers/Regata NBA Los Angeles Lakers01.webp"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Regata NBA Los Angeles Lakers</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$699,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/camisetas/Regata NBA Nike Memphis Grizzlies/Regata NBA Nike Memphis Grizzlies01.webp"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Regata NBA Nike Memphis Grizzlies</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$699,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/camisetas/Regata NBA Nike Denver Nuggets/Regata NBA Nike Denver Nuggets01.webp"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Regata NBA Nike Denver Nuggets</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$699,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
        </div>
    </section>

    <section id="sm-banner" class="section-p1">
        <div class="banner-box">
            <h4>Basquete</h4>
            <h2>Camisetas únicas</h2>
            <span>Linha dri-fit</span>
            <button class="white">Sinta a emoção</button>
        </div>
        <div class="banner-box banner-box2">
            <h4>Sneakers</h4>
            <h2>Criado para ser diferente</h2>
            <span>Fique por dentro dos lançamentos!</span>
            <button class="white">Coleção</button>
        </div>
    </section>

    <section id="banner3">
        <div class="banner-box">
        </div>
        <div class="banner-box banner-box2">
        </div>
        <div class="banner-box banner-box3">
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