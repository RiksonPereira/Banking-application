package net.javagiudes.banking.dto;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
//public class AccountDto {
//	private Long id;
//	private String accountHolderName;
//	private double balance;
//}

//the parameters passed in this class is implecitly immutable
public record AccountDto(Long id,
						 String accountHolderName,
						 double balance){

}
