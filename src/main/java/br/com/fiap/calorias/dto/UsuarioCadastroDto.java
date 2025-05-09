package br.com.fiap.calorias.dto;

public record UsuarioCadastroDto(
        Long usuarioId,
        String nome,
        String email,
        String senha
) {
}

