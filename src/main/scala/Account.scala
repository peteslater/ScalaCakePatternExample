trait Account {
	this: AccountRepositoryComponent =>

	def get() = accountRepository.get()
}
