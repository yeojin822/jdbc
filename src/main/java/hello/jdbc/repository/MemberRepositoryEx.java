package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import java.sql.SQLException;

public interface MemberRepositoryEx {
    // 구현 기술을 쉽게 변경하기 위해서 인터페이스를 도입하더라도
    // SQLException 과 같은 특정 구현 기술에 종속적인 체크 예외를 사용하게 되면
    // 인터페이스에도 해당 예외를 포함해야 한다.
    Member save(Member member) throws SQLException;

    Member findById(String memberId) throws SQLException;

    void update(String memberId, int money) throws SQLException;

    void delete(String memberId) throws SQLException;
}
