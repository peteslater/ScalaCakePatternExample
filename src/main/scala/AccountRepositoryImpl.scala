trait AccountRepositoryComponentImpl extends AccountRepositoryComponent {
	def accountRepository = new AccountRepositoryImpl

	class AccountRepositoryImpl extends AccountRepository {
		def get() = "GOT ACCOUNT"
	}
}
