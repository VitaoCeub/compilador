# compilador

Está disponível a versão do analisador Sintático para a linguagem JAVA.
Para executá-lo, você irá precisar do ANTLR. Um tutorial de como o instalar está disponível no site: https://github.com/antlr/antlr4/blob/master/doc/getting-started.md .
A gramática encontra-se no arquivo gramatica.g4

--- > Executando: 
Baixe a gramatica ou todos os arquivos disponíveis neste site. 
Entre no diretório onde baixou os arquivos.
Se você baixou todos os arquivos, este passo é desnecessário. Caso queira executar do início, digite o comando abaixo no CMD ou no terminal do linux:
$ antlr4 gramatica.g4
Compile o programa com o comando:
$ javac gramatica*.java
Depois basta executar, com o comando:
$ grun gramatica inicio -gui

---> Como funciona:
Digite na linha de comando todo o seu programa java. O compilador começa a reconhecer a partir da definição de classe, mas se desejar, você pode pular esta etapa, colocando apenas as próximas linhas.
Para finalizar, digite cntlr+D (^D) (NO LINUX) ou cntlr+Z (^Z) (NO WINDOWS)

---> Programa usado como teste:
public class vitor { 
	public static void main (String args []) {
		int i = 10;
		int z = 10+i*30+(40+i);
		while (i < 20){
			i++;
		}
		for (int i=10 ; i<=z ; i--){
			teste = 3;
		}
	}

	public void metodo (int teste) {
		if (teste < 30){
			z = 40 + 3 * 4;
		} else {
			z = i;
		}
	}	
}

-----------------------------------------------------------------------------------------------------
Está disponível a versão do analisador lexico para a linguagem JAVA.
A gramática encontra-se no arquivo Lexer.flex.
Para utilizá-lo, coloque todos os arquivos dentro de uma pasta com o nome analizador (pacote).
Compile os arquivos java. A classe principal é a classe AppMain.
Execute a classe AppMain.
O programa irá ler toda a cadeia de caracteres digitada, mesmo que esteja em outra linha.
Para finalizar a leitura de caracteres, digite a palavra "FIM" ou "fim" em uma nova linha e aperte a tecla "Enter".

Ao ler a cadeia de caracteres, será exibida a tabela de tokens que o programa reconheceu, com os respectivos valores de atributos.
Qualquer dúvida, entre em contato pelo e-mail: asgvitor@gmail.com
