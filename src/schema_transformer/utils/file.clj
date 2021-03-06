; SPDX-FileCopyrightText: 2022 Alliander N.V.
;
; SPDX-License-Identifier: Apache-2.0

(ns schema-transformer.utils.file)

(defn ext [f]
  (last
   (re-find #"\.([^.\\/:*\"?<>|\r\n]+)$" (.getName f))))