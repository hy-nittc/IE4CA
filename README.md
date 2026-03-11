# IE4CA
The Computer Architecture class conducted in the Department of Computer Science and Electronic Engineering, National Institute of Technology , Tokuyama College. 

## Prerequisites
- Homebrew
- OpenJDK
- SBT
- Surfer
- Verilator


## Install
### Homebrew
```bash
$ /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

echo >> /Users/hideakiyanagisawa/.zprofile
echo 'eval "$(/opt/homebrew/bin/brew shellenv zsh)"' >> /Users/hideakiyanagisawa/.zprofile
eval "$(/opt/homebrew/bin/brew shellenv zsh)"
```

### OpenJDK
```bash
$ brew install openjdk  
sudo ln -sfn /opt/homebrew/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
echo 'export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"' >> ~/.zshrc
export CPPFLAGS="-I/opt/homebrew/opt/openjdk/include"
```

### SBT
```bash
brew install sbt  
```

### Surfer
```bash
brew install surfer  
```

### Verilator
```bash
brew install verilator  
```

### Rosetta
```bash
softwareupdate --install-rosetta
```

```Markdown:example.md
# 見出し
## h2見出し
### h3見出し
```


```scala:example.scala
printf("")

```

~~~scala filename
printf("") 

~~~~

## Option
### Lima
$ cd workingdirectory    
$ git clone https://github.com/hy-nittc/IE4CA.git  
$ brew install lima  
$ lima start chisel.yaml  
$ limactl list  
$ limactl shell chisel  

## Digital Circuit Design
### Verilog HDL Generation
$ sbt run

### Simulation
$ sbt test

### Wave Form
$ surface


