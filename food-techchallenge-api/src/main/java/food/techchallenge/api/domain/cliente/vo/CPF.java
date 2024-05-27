package food.techchallenge.api.domain.cliente.vo;


import java.util.Objects;

import food.techchallenge.api.domain.cliente.exception.CpfInvalidException;

public class CPF {
    private final String value;

    // Expressão regular para validar o formato do CPF
    // private static final Pattern CPF_PATTERN = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");

    public CPF(String value) {
        if (value == null ||  !isValidCPF(value)) {
            throw new CpfInvalidException("Invalid CPF");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // Método que valida o CPF
    private boolean isValidCPF(String cpf) {
        cpf = cpf.replaceAll("\\D", ""); // Remove qualquer caractere não numérico

        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int[] weights = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int firstDigit = calculateDigit(cpf.substring(0, 9), weights);
        int secondDigit = calculateDigit(cpf.substring(0, 9) + firstDigit, new int[]{11, 10, 9, 8, 7, 6, 5, 4, 3, 2});

        return cpf.equals(cpf.substring(0, 9) + firstDigit + secondDigit);
    }

    // Método auxiliar para calcular os dígitos verificadores
    private int calculateDigit(String base, int[] weights) {
        int sum = 0;
        for (int i = 0; i < base.length(); i++) {
            sum += Character.getNumericValue(base.charAt(i)) * weights[i];
        }
        int remainder = 11 - (sum % 11);
        return remainder > 9 ? 0 : remainder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPF cpf = (CPF) o;
        return value.equals(cpf.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value;
    }

}
