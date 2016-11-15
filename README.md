# Compilador Final
Está disponível a versão do compilador para a linguagem JAVA.
Para executá-lo, você precisará da ferramenta APACHE-ANT.
A gramática se encontra nos arquivos Skeleton/src/decaf/Lexer.g e Parser.g
O arquivo de testes está em Skeleton/codigo.txt

## Executando 
Baixe o projeto, entre na pasta skeleton e compile o projeto com o comando ant.
> $ ant

Após o projeto ser compilador, execute-o com o comando:
> $ java -jar dist/Compiler.jar -target scan codigo.txt

A saída do programa será o a sequência de tokens e lexemas. Caso não haja erro, ele executará normalmente. Caso haja algum erro, o programa mostrará a linha e coluna do erro gerado, e o resto do programa executará normalmente.
Qualquer dúvida, entre em contato pelo e-mail: asgvitor@gmail.com

--------------------------------------------------------------------------
Está disponível a versão do analizador lexico para a linguagem JAVA.
A gramática encontra-se no arquivo Lexer.flex.
Para utilizá-lo, coloque todos os arquivos dentro de uma pasta com o nome analizador (pacote).
Compile os arquivos java. A classe principal é a classe AppMain.
Execute a classe AppMain.
O programa irá ler toda a cadeia de caracteres digitada, mesmo que esteja em outra linha.
Para finalizar a leitura de caracteres, digite a palavra "FIM" ou "fim" em uma nova linha e aperte a tecla "Enter".

Ao ler a cadeia de caracteres, será exibida a tabela de tokens que o programa reconheceu, com os respectivos valores de atributos.
Qualquer dúvida, entre em contato pelo e-mail: asgvitor@gmail.com
