Este projeto é um sistema simples de gerenciamento de ninjas em Java, utilizando uma LinkedList para armazenar os dados. Ele permite registrar, visualizar, buscar e remover ninjas através de um menu interativo no console.

Funcionalidades
O programa oferece as seguintes opções:

Registrar: Adiciona um novo ninja à lista, solicitando nome, idade e aldeia.

Mostrar Registros: Exibe todos os ninjas cadastrados na lista.

Mostrar Primeiro da Lista: Apresenta os detalhes do primeiro ninja na lista.

Mostrar Último da Lista: Apresenta os detalhes do último ninja na lista.

Remover por Posição: Remove um ninja da lista informando sua posição.

Buscar Ninja: Busca e exibe os detalhes de um ninja pela sua posição na lista.

Sair: Encerra o programa.

Estrutura do Projeto
O projeto é composto por duas classes principais:

main.java: Contém a lógica principal do programa, incluindo o menu de interação e as operações na LinkedList de ninjas.

Ninja.java: Representa um objeto "Ninja" com atributos como nome, idade e vila, além de métodos para acessá-los e modificá-los (getters e setters). Também inclui um método toString() para facilitar a exibição dos dados do ninja.

Como Compilar e Rodar
Pré-requisitos: Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

Clone o repositório: Se este código estiver em um repositório, clone-o para sua máquina local. Caso contrário, salve os arquivos main.java e Ninja.java na mesma pasta.

Navegue até o diretório: Abra um terminal ou prompt de comando e navegue até o diretório onde os arquivos .java estão salvos.

Compile os arquivos:

Bash

javac Desafios/intermed6/*.java
Execute o programa:

Bash

java Desafios.intermed6.main
Exemplo de Uso
Ao executar o programa, você verá o seguinte menu:

Menu:
1 - Registar
2 - Mostrar registrador
3 - Mostrar primeiro na lista
4 - Mostrar ultimo da lista
5 - Remover por posicao
6 - Buscar ninja
7 - Sair
Acesso:
Você pode digitar o número correspondente à opção desejada e seguir as instruções no console.

Contribuições
Sinta-se à vontade para sugerir melhorias ou reportar problemas.
