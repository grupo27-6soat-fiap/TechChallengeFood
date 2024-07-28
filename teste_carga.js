import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
  stages: [
    { duration: '30s', target: 1000 }, // Ramp-up para 100 usuários em 30 segundos
    { duration: '1m', target: 100 },  // Manter 100 usuários por 1 minuto
    { duration: '30s', target: 0 },   // Ramp-down para 0 usuários em 30 segundos
  ],
};

export default function () {
  let res = http.get('http://localhost:30002/produto/listar');
  check(res, {
    'status is 200': (r) => r.status === 200,
  });
  sleep(1); // Pausa de 1 segundo entre as requisições
}

