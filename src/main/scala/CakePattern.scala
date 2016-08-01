object CakePattern extends App {
	println("Cake Pattern Example")

	println(AccountImpl.get())

}

object AccountImpl extends Account with AccountRepositoryComponentImpl
