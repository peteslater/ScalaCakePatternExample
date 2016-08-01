trait AccountRepositoryComponent {
	def accountRepository: AccountRepository

	trait AccountRepository {
		def get(): String
	}
}
