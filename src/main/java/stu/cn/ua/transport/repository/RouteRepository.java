package stu.cn.ua.transport.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import stu.cn.ua.transport.domain.Route;

public interface RouteRepository extends JpaRepository<Route, Long>{
}
