# 🥗 IMC Fácil

> Calcule seu Índice de Massa Corporal (IMC) em segundos.

![Plataforma](https://img.shields.io/badge/plataforma-Android-3DDC84?logo=android&logoColor=white)
![Linguagem](https://img.shields.io/badge/linguagem-Kotlin-7F52FF?logo=kotlin&logoColor=white)
![Build](https://img.shields.io/badge/build-Gradle%20(Kotlin%20DSL)-02303A?logo=gradle&logoColor=white)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-orange)

**IMC Fácil** é um aplicativo Android simples, rápido e direto ao ponto para calcular o Índice de Massa Corporal. Basta informar **peso** e **altura** para receber o valor do IMC, a classificação segundo a Organização Mundial da Saúde (OMS) e uma orientação curta sobre o resultado.

🔒 **Privacidade em primeiro lugar:** os dados informados **não são armazenados**.

---

## 📱 Screenshots

| Splash | Cálculo | Resultado |
| :---: | :---: | :---: |
| <img width="1080" height="2424" alt="Image" src="https://github.com/user-attachments/assets/26fa050b-8f4b-4854-bd14-3dd9cb0eb580" />| <img width="1080" height="2424" alt="Image" src="https://github.com/user-attachments/assets/5a22087f-eefe-4c8c-b3fc-6727de4027a3" /> | <img width="1080" height="2424" alt="Image" src="https://github.com/user-attachments/assets/142e1b53-aecf-457f-a004-78f46805c2d9" /> |

---

## ✨ Funcionalidades

- **Tela de abertura (splash)** com identidade visual do app e indicador de carregamento.
- **Formulário de entrada** com campos de peso (kg) e altura (m), com exemplos de preenchimento.
- **Cálculo instantâneo do IMC** ao tocar em *Calcular IMC*.
- **Classificação do resultado** exibida em destaque (ex.: *Peso normal*).
- **Mensagem orientativa** de acordo com a faixa do IMC.
- **Botão "Calcular Novamente"** para refazer o cálculo rapidamente.
- **Sem armazenamento de dados** pessoais.

---

## 🧮 Como o IMC é calculado

```
IMC = peso (kg) ÷ altura² (m)
```

**Exemplo:** peso de 80 kg e altura de 1,80 m

```
IMC = 80 ÷ (1,80 × 1,80) =  24,7
```

### Classificação (OMS)

| IMC (kg/m²)     | Classificação            |
| --------------- | ------------------------ |
| Abaixo de 18,5  | Abaixo do peso           |
| 18,5 – 24,9     | Peso normal              |
| 25,0 – 29,9     | Sobrepeso                |
| 30,0 – 34,9     | Obesidade grau I         |
| 35,0 – 39,9     | Obesidade grau II        |
| 40,0 ou mais    | Obesidade grau III       |

> ⚠️ **Aviso:** o IMC é apenas um indicador de triagem e não substitui a avaliação de um profissional de saúde. Ele não diferencia massa muscular de gordura e pode não ser adequado para crianças, gestantes, idosos e atletas.

---

## 🖼️ Fluxo do app

1. **Splash:** exibe o nome *IMC Fácil* e a frase *"Calcule seu Índice de Massa Corporal em segundos"*.
2. **Cálculo IMC:** o usuário preenche **Peso em kg** (ex.: `80`) e **Altura em m** (ex.: `1.80`) e toca em **Calcular IMC**.
3. **Seu resultado:** o app mostra o valor do IMC dentro de um círculo, a classificação (*Peso normal*) e uma mensagem explicativa. Em seguida, é possível voltar ou tocar em **Calcular Novamente**.

---

## 🛠️ Tecnologias

- **Android** (aplicativo nativo)
- **Kotlin**
- **Gradle** com Kotlin DSL (`build.gradle.kts`, `settings.gradle.kts`)
- **Version Catalog** do Gradle (`gradle/libs.versions.toml`)
- **Material Design** (componentes visuais, campos de texto contornados e botões arredondados)



---

## 📂 Estrutura do projeto

```
IMCFacil/
├── app/                      # Módulo principal do aplicativo
├── gradle/                   # Wrapper e catálogo de versões
├── build.gradle.kts          # Configuração de build (nível de projeto)
├── settings.gradle.kts       # Configuração dos módulos
├── gradle.properties         # Propriedades do Gradle
├── gradlew / gradlew.bat     # Gradle Wrapper (Linux/macOS e Windows)
└── docs/
    └── screenshots/          # Imagens usadas neste README
```

---

## 🚀 Como executar

### Pré-requisitos

- [Android Studio](https://developer.android.com/studio) (versão recente)
- JDK 17 ou superior
- Emulador Android ou dispositivo físico com depuração USB ativada

### Passo a passo

```bash
# 1. Clone o repositório
git clone https://github.com/antoniojose2023/IMCFacil.git

# 2. Entre na pasta do projeto
cd IMCFacil
```

3. Abra a pasta no **Android Studio** e aguarde a sincronização do Gradle.
4. Selecione um emulador ou dispositivo conectado.
5. Clique em **Run ▶️** (ou `Shift + F10`).

### Gerar o APK via linha de comando

```bash
# Linux / macOS
./gradlew assembleDebug

# Windows
gradlew.bat assembleDebug
```

O APK será gerado em `app/build/outputs/apk/debug/`.

---

## 🗺️ Roadmap
- [ ] Compartilhamento do resultado
- [ ] Testes unitários para a lógica de cálculo e classificação

---

## 🤝 Contribuindo

Contribuições são bem-vindas!

1. Faça um fork do projeto
2. Crie uma branch: `git checkout -b feature/minha-feature`
3. Faça o commit: `git commit -m "feat: minha nova feature"`
4. Envie a branch: `git push origin feature/minha-feature`
5. Abra um Pull Request

---

## 📄 Licença

Este projeto ainda não possui uma licença definida. Caso queira torná-lo open source, considere adicionar um arquivo `LICENSE` (por exemplo, MIT).

---

## 👨‍💻 Autor

**Antônio José**
