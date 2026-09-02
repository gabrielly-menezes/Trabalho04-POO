package alessio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	//EXEMPLO 1
//        Div containerPrincipal = new Div("main-container", "box-container");
//        containerPrincipal.adicionarEstilo("border", "2px solid black");
//        containerPrincipal.adicionarEstilo("padding", "20px");
//
//        Div card = new Div("card-1", "card");
//        card.adicionarEstilo("background-color", "#f0f0f0");
//
//        Paragrafo p1 = new Paragrafo("p1", "texto-destaque", "Olá, mundo da POO!");
//        card.adicionarFilho(p1);
//
//        containerPrincipal.adicionarFilho(card);
//
//        // Imprime a estrutura HTML gerada no console
//        System.out.println(containerPrincipal.renderizar(0));
        
    	// 1. Container Principal (Flexbox em linha)

//===================================================================================================
    	
    	//EXEMPLO 2 
//        Div containerPrincipal = new Div("main-container", "flex-container");
//        containerPrincipal.adicionarEstilo("display", "flex");
//        containerPrincipal.adicionarEstilo("gap", "20px");
//        containerPrincipal.adicionarEstilo("width", "100%");
//        containerPrincipal.adicionarEstilo("height", "400px");
//
//        // 2. Coluna da Esquerda: Contêiner para as duas DIVs empilhadas (Flexbox em coluna)
//        Div colunaEsquerda = new Div("coluna-esquerda", "coluna");
//        colunaEsquerda.adicionarEstilo("display", "flex");
//        colunaEsquerda.adicionarEstilo("flex-direction", "column");
//        colunaEsquerda.adicionarEstilo("width", "50%");
//        colunaEsquerda.adicionarEstilo("height", "100%");
//        colunaEsquerda.adicionarEstilo("gap", "10px");
//
//        // DIV Superior (50% da altura)
//        Div divSuperior = new Div("div-sup", "caixa-filha");
//        divSuperior.adicionarEstilo("height", "50%");
//        divSuperior.adicionarEstilo("background-color", "#e0e0e0");
//        divSuperior.adicionarFilho(new Paragrafo("p-sup", "texto", "Div Superior (50% de altura)"));
//
//        // DIV Inferior (50% da altura)
//        Div divInferior = new Div("div-inf", "caixa-filha");
//        divInferior.adicionarEstilo("height", "50%");
//        divInferior.adicionarEstilo("background-color", "#d0d0d0");
//        divInferior.adicionarFilho(new Paragrafo("p-inf", "texto", "Div Inferior (50% de altura)"));
//
//        // Adiciona as duas DIVs na coluna da esquerda
//        colunaEsquerda.adicionarFilho(divSuperior);
//        colunaEsquerda.adicionarFilho(divInferior);
//
//        // 3. Coluna da Direita: Formulário com 3 Inputs (50% da largura)
//        Formulario form = new Formulario("form-cadastro", "formulario-estilizado", "/enviar", "POST");
//        form.adicionarEstilo("width", "50%");
//        form.adicionarEstilo("height", "100%");
//        form.adicionarEstilo("display", "flex");
//        form.adicionarEstilo("flex-direction", "column");
//        form.adicionarEstilo("gap", "15px");
//        form.adicionarEstilo("background-color", "#f9f9f9");
//        form.adicionarEstilo("padding", "20px");
//
//        Input inputNome = new Input("input-nome", "campo", "text", "nome", "Digite seu nome");
//        Input inputEmail = new Input("input-email", "campo", "email", "email", "Digite seu e-mail");
//        Input inputSenha = new Input("input-senha", "campo", "password", "senha", "Digite sua senha");
//
//        form.adicionarFilho(inputNome);
//        form.adicionarFilho(inputEmail);
//        form.adicionarFilho(inputSenha);
//
//        // 4. Monta a estrutura final
//        containerPrincipal.adicionarFilho(colunaEsquerda);
//        containerPrincipal.adicionarFilho(form);
//
//        // Renderiza no console
//        System.out.println(containerPrincipal.renderizar(0));
    	
//===========================================================================================================
//        EXEMPLO 3

        Scanner scanner = new Scanner(System.in);
//    			        // =========================================================================
//    			        // EXEMPLO DE ENTRADA QUE O USUÁRIO DEVERÁ FAZER NO CONSOLE:
//    			        // 1          -> Define que as DIVs ficam na Esquerda e o Form na Direita
//    			        // 1          -> Define a largura das DIVs em 50% (e o Form fica com os outros 50%)
//    			        // 400        -> Define a altura total do layout em 400px
//    			        // =========================================================================
//
//    			        System.out.println("=== CONFIGURAÇÃO DO LAYOUT ===");
//    			        
//    			        // 1. Posição das DIVs
//    			        System.out.println("1. Onde deseja posicionar as 2 Divs empilhadas?");
//    			        System.out.println("1 - Esquerda (Formulário na Direita)");
//    			        System.out.println("2 - Direita (Formulário na Esquerda)");
//    			        System.out.print("Opção: ");
//    			        int posOpcao = scanner.nextInt();
//
//    			        // 2. Largura das DIVs
//    			        System.out.println("\n2. Qual a largura ocupada pelas Divs?");
//    			        System.out.println("1 - 50% (Metade)");
//    			        System.out.println("2 - 30%");
//    			        System.out.println("3 - 70%");
//    			        System.out.print("Opção: ");
//    			        int largOpcao = scanner.nextInt();
//
//    			        // 3. Altura do Container Principal
//    			        System.out.print("\n3. Qual a altura total do container (em px)? ");
//    			        int alturaPx = scanner.nextInt();
//
//    			        // --- PROCESSAMENTO DAS RESPOSTAS ---
//    			        
//    			        // Define as porcentagens de largura
//    			        String larguraDivs = "50%";
//    			        String larguraForm = "50%";
//    			        if (largOpcao == 2) {
//    			            larguraDivs = "30%";
//    			            larguraForm = "70%";
//    			        } else if (largOpcao == 3) {
//    			            larguraDivs = "70%";
//    			            larguraForm = "30%";
//    			        }
//
//    			        // 1. Instância do Container Principal
//    			        Div containerPrincipal = new Div("main-container", "flex-container");
//    			        containerPrincipal.adicionarEstilo("display", "flex");
//    			        containerPrincipal.adicionarEstilo("gap", "20px");
//    			        containerPrincipal.adicionarEstilo("width", "100%");
//    			        containerPrincipal.adicionarEstilo("height", alturaPx + "px");
//
//    			        // 2. Instância da Coluna das DIVs Empilhadas
//    			        Div colunaDivs = new Div("coluna-divs", "coluna");
//    			        colunaDivs.adicionarEstilo("display", "flex");
//    			        colunaDivs.adicionarEstilo("flex-direction", "column");
//    			        colunaDivs.adicionarEstilo("width", larguraDivs);
//    			        colunaDivs.adicionarEstilo("height", "100%");
//    			        colunaDivs.adicionarEstilo("gap", "10px");
//
//    			        // As duas DIVs internas (cada uma com 50% da altura)
//    			        Div divSuperior = new Div("div-sup", "caixa-filha");
//    			        divSuperior.adicionarEstilo("height", "50%");
//    			        divSuperior.adicionarEstilo("background-color", "#e0e0e0");
//    			        divSuperior.adicionarFilho(new Paragrafo("p-sup", "texto", "Div Superior (50% de altura)"));
//
//    			        Div divInferior = new Div("div-inf", "caixa-filha");
//    			        divInferior.adicionarEstilo("height", "50%");
//    			        divInferior.adicionarEstilo("background-color", "#d0d0d0");
//    			        divInferior.adicionarFilho(new Paragrafo("p-inf", "texto", "Div Inferior (50% de altura)"));
//
//    			        colunaDivs.adicionarFilho(divSuperior);
//    			        colunaDivs.adicionarFilho(divInferior);
//
//    			        // 3. Instância do Formulário
//    			        Formulario form = new Formulario("form-cadastro", "formulario-estilizado", "/enviar", "POST");
//    			        form.adicionarEstilo("width", larguraForm);
//    			        form.adicionarEstilo("height", "100%");
//    			        form.adicionarEstilo("display", "flex");
//    			        form.adicionarEstilo("flex-direction", "column");
//    			        form.adicionarEstilo("gap", "15px");
//    			        form.adicionarEstilo("background-color", "#f9f9f9");
//    			        form.adicionarEstilo("padding", "20px");
//
//    			        form.adicionarFilho(new Input("input-nome", "campo", "text", "nome", "Digite seu nome"));
//    			        form.adicionarFilho(new Input("input-email", "campo", "email", "email", "Digite seu e-mail"));
//    			        form.adicionarFilho(new Input("input-senha", "campo", "password", "senha", "Digite sua senha"));
//
//    			        // 4. Montagem dinâmica na ordem escolhida pelo usuário
//    			        if (posOpcao == 1) {
//    			            // DIVs na esquerda, Form na direita
//    			            containerPrincipal.adicionarFilho(colunaDivs);
//    			            containerPrincipal.adicionarFilho(form);
//    			        } else {
//    			            // Form na esquerda, DIVs na direita
//    			            containerPrincipal.adicionarFilho(form);
//    			            containerPrincipal.adicionarFilho(colunaDivs);
//    			        }
//
//    			        // Exibe a saída gerada em HTML
//    			        System.out.println("\n=== HTML GERADO COM SUCESSO ===");
//    			        System.out.println(containerPrincipal.renderizar(0));

    			
//    			// EXEMPLO 4
//    			     // EXEMPLO DE ENTRADA QUE O USUÁRIO DEVERÁ FAZER NO CONSOLE:
//    			        // 2          -> Quantidade de Divs que deseja criar na coluna de Divs
//    			        // 1          -> Quantidade de Formulários a criar
//    			        // 3          -> Quantidade de inputs no Formulário 1
//    			        // Digite seu nome   -> Placeholder do Input 1
//    			        // Digite seu e-mail -> Placeholder do Input 2
//    			        // Digite sua senha  -> Placeholder do Input 3
//    			        // 1          -> Posicionamento: 1 (Divs na Esquerda) ou 2 (Divs na Direita)
//    			        // 400        -> Altura do container principal em px
//    			        // =========================================================================

    			        System.out.println("=== CONFIGURADOR DE LAYOUT DINÂMICO ===");

    			        // 1. Definição da quantidade de Divs
    			        System.out.print("\nQuantas Divs deseja criar empilhadas na coluna? ");
    			        int qtdDivs = scanner.nextInt();

    			        // 2. Definição dos Formulários e seus Inputs
    			        System.out.print("Quantos Formulários deseja criar? ");
    			        int qtdForms = scanner.nextInt();
    			        scanner.nextLine(); // Consome a quebra de linha do scanner

    			        // 3. Posicionamento e Altura
    			        System.out.println("\nQual a disposição no container principal?");
    			        System.out.println("1 - Coluna de Divs na Esquerda | Formulários na Direita");
    			        System.out.println("2 - Formulários na Esquerda | Coluna de Divs na Direita");
    			        System.out.print("Opção: ");
    			        int posicao = scanner.nextInt();

    			        System.out.print("\nQual a altura total do container (em px)? ");
    			        int alturaPx = scanner.nextInt();
    			        scanner.nextLine();

    			        // --- CONSTRUÇÃO DA ESTRUTURA HTML ---

    			        // Container Principal
    			        Div containerPrincipal = new Div("main-container", "flex-container");
    			        containerPrincipal.adicionarEstilo("display", "flex");
    			        containerPrincipal.adicionarEstilo("gap", "20px");
    			        containerPrincipal.adicionarEstilo("width", "100%");
    			        containerPrincipal.adicionarEstilo("height", alturaPx + "px");

    			        // Coluna de Divs
    			        Div colunaDivs = new Div("coluna-divs", "coluna");
    			        colunaDivs.adicionarEstilo("display", "flex");
    			        colunaDivs.adicionarEstilo("flex-direction", "column");
    			        colunaDivs.adicionarEstilo("width", "50%");
    			        colunaDivs.adicionarEstilo("height", "100%");
    			        colunaDivs.adicionarEstilo("gap", "10px");

    			        // Calcula a porcentagem de altura proporcional para cada Div criada
    			        int alturaPorcentagemDiv = qtdDivs > 0 ? 100 / qtdDivs : 100;

    			        for (int i = 1; i <= qtdDivs; i++) {
    			            Div divFilha = new Div("div-filha-" + i, "caixa-filha");
    			            divFilha.adicionarEstilo("height", alturaPorcentagemDiv + "%");
    			            divFilha.adicionarEstilo("background-color", "#e0e0e0");
    			            divFilha.adicionarFilho(new Paragrafo("p-" + i, "texto", "Conteúdo da Div " + i));
    			            colunaDivs.adicionarFilho(divFilha);
    			        }

    			        // Coluna de Formulários
    			        Div colunaForms = new Div("coluna-forms", "coluna");
    			        colunaForms.adicionarEstilo("display", "flex");
    			        colunaForms.adicionarEstilo("flex-direction", "column");
    			        colunaForms.adicionarEstilo("width", "50%");
    			        colunaForms.adicionarEstilo("height", "100%");
    			        colunaForms.adicionarEstilo("gap", "15px");

    			        for (int f = 1; f <= qtdForms; f++) {
    			            System.out.println("\n--- CONFIGURAÇÃO DO FORMULÁRIO " + f + " ---");
    			            System.out.print("Quantos inputs este formulário terá? ");
    			            int qtdInputs = scanner.nextInt();
    			            scanner.nextLine();

    			            Formulario form = new Formulario("form-" + f, "formulario-estilizado", "/enviar", "POST");
    			            form.adicionarEstilo("display", "flex");
    			            form.adicionarEstilo("flex-direction", "column");
    			            form.adicionarEstilo("gap", "10px");
    			            form.adicionarEstilo("background-color", "#f9f9f9");
    			            form.adicionarEstilo("padding", "15px");

    			            for (int inp = 1; inp <= qtdInputs; inp++) {
    			                System.out.print("Texto do placeholder para o Input " + inp + ": ");
    			                String placeholder = scanner.nextLine();

    			                Input input = new Input(
    			                    "input-" + f + "-" + inp,
    			                    "campo",
    			                    "text",
    			                    "campo_" + f + "_" + inp,
    			                    placeholder
    			                );
    			                form.adicionarFilho(input);
    			            }
    			            colunaForms.adicionarFilho(form);
    			        }

    			        // Montagem do Layout Principal de acordo com a opção escolhida
    			        if (posicao == 1) {
    			            containerPrincipal.adicionarFilho(colunaDivs);
    			            containerPrincipal.adicionarFilho(colunaForms);
    			        } else {
    			            containerPrincipal.adicionarFilho(colunaForms);
    			            containerPrincipal.adicionarFilho(colunaDivs);
    			        }

    			        // Renderização do HTML gerado
    			        System.out.println("\n=== HTML GERADO COM SUCESSO ===");
    			        System.out.println(containerPrincipal.renderizar(0));
//
//
//    			
    }
}

