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

            <div class="usuario">
                <div class="form">
                    <form action="/criar-endereco?id=${usuario.id}" class="sign-in-form" method="post">

                        <h2 class="title">Cadastrar endereço</h2>

                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Rua" name="user-rua" id="user-rua" />
                        </div>

                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Número" name="user-numero" id="user-numero" />
                        </div>

                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Bairro" name="user-bairro" id="user-bairro" />
                        </div>

                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Cep" name="user-cep" id="user-cep"  />
                        </div>
                        <input hidden type="text" placeholder="id" name="user-id" id="user-id" value="${usuario.id}" />

                        <input type="submit" class="btn" value="Cadastrar" />

                    </form>

                </div>

                <div class="dadosTotal">

                    <div class="total">
                        <h3 class="nomes h3nome">Nome: <p class="nome">${usuario.nome}</p>
                        </h3>
                    </div>

                    <div class="total">
                        <h3 class="nomes">E-mail: <p class="email">${usuario.email}</p>
                        </h3>
                    </div>

                    <div class="total">
                        <h3 class="nomes">Telefone: <p class="telefone">${usuario.telefone}</p>
                        </h3>
                    </div>

                    <div class="total">
                        <h3 class="nomes">Data de nascimento: <p class="dataNasc">${usuario.dataNascimento}</p>
                        </h3>
                    </div>

                    <div class="total">
                        <h3 class="nomes">Cpf: <p class="cpf">${usuario.cpf}</p>
                        </h3>
                    </div>

                </div>

            </div>

            <!-- Listar Enderecos -->

            <div class="bloco2">

                <h3 class="h3">Endereços cadastrados:</h3>

                <!-- <h4 class="h4">Ainda não há endereços cadastrados</h4> -->

                <div class="total enderecoCadastrado">
                    <table>
                        <c:forEach var="endereco" items="${enderecos}">
                            <tr>
                                <td>
                                    <h4 hidden class="end" id="id" name="id">${endereco.id}</h4>
                                    <text class="end">${endereco.rua}, ${endereco.bairro}, N° ${endereco.numero}.</text>
                                    <text class="end">CEP: ${endereco.cep} </text>
                                    <div class="botoes">

                                        <a
                                            href="endereco.jsp?id=${endereco.id}&rua=${endereco.rua}&numero=${endereco.numero}&bairro=${endereco.bairro}&cep=${endereco.cep}&userId=${usuario.id}"><input
                                                type="submit" class="btn" value="Atualizar" /></a>


                                        <form action="/excluir-endereco?id=${endereco.id}&userId=${usuario.id}"
                                            method="post">
                                            <input type="submit" class="btn bot" value="Excluir" />
                                        </form>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>

                </div>

            </div>
            <!-- Fim Listar Enderecos -->

            <!-- Lista pedidos -->
            <br>
          <div class="bloco2">

           <h3 class="h3">Pedidos cadastrados:</h3>
            <section id="cart" class="section-p1">
                    <table width="100%">
                        <thead>
                            <tr>
                                <td>Imagem</td>
                                <td>Produto</td>
                                <td>Preço</td>
                                <td>Quantidade</td>
                                <td>Subtotal</td>
                                <td>Endereco de entrega</td>
                            </tr>
                        </thead>

                        <tbody>
                        <c:if test="${not empty pedidos}">
                        <c:forEach var="item" items="${pedidos}">
                            <tr>
                                <td><img src="${item.imagem}" alt=""></td>
                                <td>${item.produto}</td>
                                <td>R$ ${item.preco} </td>
                                <td>${item.quantidade}</td>
                                <td>R$ ${item.subTotal} </td>
                                <td>${item.endereco} </td>
                            </tr>
                        </c:forEach>
                        </c:if>
                        </tbody>
                    </table>
                </section>
                </div>
            <!-- Fim Lista pedidos -->

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