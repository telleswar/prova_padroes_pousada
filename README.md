Projeto Pousada - Padrões de Projeto
Este é um projeto de exemplo para a disciplina de Padrões de Projeto, com foco na implementação de uma aplicação para gerenciar uma pousada. O objetivo é demonstrar a aplicação de diferentes padrões de projeto em um contexto prático.

Descrição do Projeto
O projeto consiste em um sistema para gerenciar uma pousada, com funcionalidades como cadastro de hóspedes, reserva de quartos e consulta de disponibilidade. Ele é desenvolvido em Java e utiliza padrões de projeto para promover uma estrutura de código mais flexível, modular e de fácil manutenção.

Funcionalidades
O sistema da pousada oferece as seguintes funcionalidades principais:

Cadastro de hóspedes: permite cadastrar os dados dos hóspedes, como nome, CPF e idade.
Reserva de quartos: possibilita a reserva de quartos para os hóspedes, considerando a disponibilidade e características dos quartos.
Consulta de disponibilidade: permite verificar a disponibilidade de quartos em determinadas datas.
Gerenciamento de quartos: oferece a possibilidade de adicionar, remover e atualizar informações dos quartos disponíveis na pousada.
Padrões de Projeto Utilizados
Os seguintes padrões de projeto são aplicados neste projeto:

Factory Method: utilizado na criação dos objetos de estrutura de dados, como a classe Pousada e Quarto.
Singleton: aplicado na classe responsável pelo gerenciamento da pousada, garantindo que haja apenas uma instância dessa classe em toda a aplicação.
Observer: utilizado para notificar os hóspedes sobre a disponibilidade de quartos e atualizações nas reservas.
Builder: empregado na construção de objetos complexos, como os dados de um hóspede, permitindo a criação passo a passo com diferentes opções configuráveis.
Strategy: utilizado para definir diferentes estratégias de cálculo de preço da reserva, permitindo a aplicação de descontos ou políticas específicas.
Iterator: aplicado para percorrer e acessar os elementos da lista de quartos da pousada de maneira padronizada.
Estrutura do Projeto
A estrutura do projeto está organizada da seguinte forma:

src/: diretório principal do código-fonte
models/: pacote contendo as classes de modelo, como Pousada, Quarto e Hospede.
services/: pacote contendo as classes de serviços, como ReservaService e ConsultaDisponibilidadeService.
factories/: pacote contendo as classes de criação de objetos, como PousadaFactory e QuartoFactory.
observers/: pacote contendo as classes relacionadas ao padrão Observer, como Observer e Subject.
builders/: pacote contendo as classes relacionadas ao padrão Builder, como HospedeBuilder.
strategies/: pacote contendo as classes relacionadas ao padrão Strategy, como CalculadoraPreco e suas implementações específicas.
iterators/: pacote contendo as classes relacionadas ao padrão Iterator, como QuartoIterator.
Main.java: classe principal da aplicação.
