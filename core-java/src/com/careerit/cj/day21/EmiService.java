package com.careerit.cj.day21;

import java.util.List;

public interface EmiService {

		public List<AccountDto> getAccountWithEmiAmount();
		public List<AccountDto> getMaxAmountAccounts();
		public List<AccountDto> getMaxInterestAccounts();
		public List<AccountInterestAmountDto> getAccountWithEmiAndTotalInterest();
}
