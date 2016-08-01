import org.scalatest.FlatSpec

class CakePatternSpec extends FlatSpec {
	"A Account implementation with a test Account repository" should "return test values" in {
		assert(AccountTestImpl.get() === "THIS IS A TEST")
	}
}

trait AccountRepositoryTestImpl extends AccountRepositoryComponent {
	def accountRepository = new AccountRepositoryTestImpl

	class AccountRepositoryTestImpl extends AccountRepository {
		def get() = "THIS IS A TEST"
	}
}

object AccountTestImpl extends Account with AccountRepositoryTestImpl
