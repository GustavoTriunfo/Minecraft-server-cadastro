USE [master]
GO

/****** Criar database******/
CREATE DATABASE [db_8]
 CONTAINMENT = NONE


/****** Criar tabela******/
 USE [db_8]
GO

CREATE TABLE [dbo].[BancoClientes](
	[Nome] [varchar](50) NOT NULL,
	[CPF] [varchar](50) NOT NULL,
	[Telefone] [varchar](50) NOT NULL,
	[Cidade] [varchar](50) NOT NULL,
	[UF] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
 CONSTRAINT [PK_CadastroCliente] PRIMARY KEY CLUSTERED 
(
	[CPF] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]