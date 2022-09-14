package com.banco.app.services;

import java.util.List;

import com.banco.app.Dto.Requests.RequestClient;
import com.banco.app.Dto.Responses.ResponseClient;

/**
 * IClientService
 */
public interface IClientService {
  List<ResponseClient> getClients();

  List<ResponseClient> getClientsWithAccounts();

  ResponseClient getClient(Long id);

  ResponseClient deleteClient(Long id);

  ResponseClient updateClient(Long id, RequestClient requestClient);

  ResponseClient saveClient(RequestClient requestClient);
}
