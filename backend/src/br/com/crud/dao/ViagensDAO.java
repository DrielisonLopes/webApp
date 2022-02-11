package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Viagens;

public class ViagensDAO {
	
	public void save(Viagens viagem) {
		/*
		 * Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
		 * de dados
		 */

		String sql = "INSERT INTO Viagens (Partida, Destino, DataIda, DataVolta)" + "VALUES(?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parámetro da sql
			pstm.setString(1, viagem.getPartida());

			// Adicionar o valor do segundo parâmetro da sql
			pstm.setString(2, viagem.getDestino());

			// Adicionar o valor do terceiro parâmetro da sql
			pstm.setString(3, viagem.getDataIda());

			// Adicionar o valor do quarto parâmetro da sql
			pstm.setString(4, viagem.getDataVolta());

			// Executar a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fecha as conexões
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeById(int id) {
		String sql = "DELETE FROM Viagens WHERE Id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Viagens viagem) {
		String sql = "UPDATE Viagens SET Partida = ?, Destino = ?, DataIda = ?, DataVolta = ? WHERE Id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adiciona o valor do primeiro parâmetro da sql
			pstm.setString(1, viagem.getPartida());

			// Adicionar o valor do segundo parâmetro da sql
			pstm.setString(2, viagem.getDestino());

            // Adicionar o valor do terceiro parâmetro da sql
			pstm.setString(3, viagem.getDataIda());

            // Adicionar o valor do quarto parâmetro da sql
			pstm.setString(4, viagem.getDataVolta());

			// Adicionar o valor do quinto parâmetro da sql
			pstm.setInt(5, viagem.getId());

			// Executa a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conexões
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Viagens> getViagens() {

		String sql = "SELECT * FROM Viagens";

		List<Viagens> viagens = new ArrayList<Viagens>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faça
			while (rset.next()) {
				Viagens viagem = new Viagens();

				// Recupera o id do banco e atribui ele ao objeto
				viagem.setId(rset.getInt("Id"));

				// Recupera a partida do banco e atribui ele ao objeto
				viagem.setPartida(rset.getString("Partida"));

				// Recupera o destino do banco e atribui ele ao objeto
				viagem.setDestino(rset.getString("Destino"));

                // Recupera a data de ida do banco e atribui ele ao objeto
				viagem.setDataIda(rset.getString("DataIda"));

                // Recupera a data de volta do banco e atribui ele ao objeto
				viagem.setDataVolta(rset.getString("DataVolta"));

				// Adiciona o contato recuperado, a lista de contatos
				viagens.add(viagem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return viagens;
	}
}